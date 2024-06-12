package com.mycompany.tugas_besar_mkepl;
import static org.junit.Assert.*;
import org.junit.Test;

public class KubusTest {

    private Kubus kubus = new Kubus(5, "kiub");

    @Test
    public void hitungLuasPermukaan() {
        assertEquals(150.0, kubus.hitungLuasPermukaan(), 0);
    }

    @Test
    public void hitungVolume() {
        assertEquals(125.0, kubus.hitungVolume(), 0);
    }
}