package net.dragoons.dokimod.util;

public class GlobalSpeed {
    // Minecraft's default movement speed is 0.22 blocks/s
    public static final double VALUE = 0.22;

    public static double fromRate (double rate) {
        return VALUE * rate;
    }
}
