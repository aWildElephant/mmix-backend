package fr.awildelephant.mix.emulator.engine.executor;

import fr.awildelephant.mix.emulator.engine.modification.SetMemoryCell;
import fr.awildelephant.mix.emulator.engine.modification.StateModification;
import fr.awildelephant.mix.emulator.engine.state.Machine;
import fr.awildelephant.mix.emulator.instruction.Address;
import fr.awildelephant.mix.emulator.instruction.FieldSpecificationService;
import fr.awildelephant.mix.emulator.instruction.Instruction;
import fr.awildelephant.mix.emulator.word.TwoBytesSignedMathService;
import fr.awildelephant.mix.emulator.word.Word;

public final class STXExecutor extends AbstractSpecializedExecutor {

    public STXExecutor(TwoBytesSignedMathService twoBytesSignedMathService, FieldSpecificationService fieldSpecificationService) {
        super(twoBytesSignedMathService, fieldSpecificationService);
    }

    @Override
    public StateModification apply(Machine machine, Instruction instruction) {
        final Address memoryAddress = indexingProcess(machine, instruction);
        final Word memoryValue = machine.getMemory().get(memoryAddress);
        final Word registerValue = machine.getRegisterX().getWord();

        final Word newValue = applyFieldSpecification(registerValue, memoryValue, instruction);

        return new SetMemoryCell(memoryAddress, newValue);
    }
}
