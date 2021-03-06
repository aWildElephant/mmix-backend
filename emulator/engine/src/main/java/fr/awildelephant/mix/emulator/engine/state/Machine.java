package fr.awildelephant.mix.emulator.engine.state;

import fr.awildelephant.mix.emulator.instruction.AddressService;
import lombok.Getter;

@Getter
public final class Machine {

    private final SignedFiveBytesRegister registerA = new SignedFiveBytesRegister();
    private final SignedFiveBytesRegister registerX = new SignedFiveBytesRegister();
    private final TwoBytesSignedRegister rI1 = new TwoBytesSignedRegister();
    private final TwoBytesSignedRegister rI2 = new TwoBytesSignedRegister();
    private final TwoBytesSignedRegister rI3 = new TwoBytesSignedRegister();
    private final TwoBytesSignedRegister rI4 = new TwoBytesSignedRegister();
    private final TwoBytesSignedRegister rI5 = new TwoBytesSignedRegister();
    private final TwoBytesSignedRegister rI6 = new TwoBytesSignedRegister();
    private final OverflowToggle overflowToggle = new OverflowToggle();
    private final ComparisonIndicator comparisonIndicator = new ComparisonIndicator();
    private final Memory memory;

    public Machine(AddressService addressService) {
        memory = new Memory(addressService);
    }
}
