package fr.awildelephant.mmix.emulator.engine.modification;

import fr.awildelephant.mmix.emulator.engine.state.Machine;
import fr.awildelephant.mmix.emulator.word.Word;
import lombok.Value;

@Value
public class SetARegister implements StateModification {

    Word newValue;

    @Override
    public void accept(Machine machine) {
        machine.getARegister().setWord(newValue);
    }
}