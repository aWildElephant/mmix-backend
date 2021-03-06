package fr.awildelephant.mix.emulator.engine.modification;

import fr.awildelephant.mix.emulator.engine.state.Machine;
import fr.awildelephant.mix.emulator.word.Word;
import lombok.Value;

@Value
public class SetARegister implements StateModification {

    Word newValue;

    @Override
    public void accept(Machine machine) {
        machine.getRegisterA().setWord(newValue);
    }
}
