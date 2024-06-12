package com.mycompany.tugas_besar_mkepl;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimaSegi3Test {

    PrimaSegi3 primaSegi3 = new PrimaSegi3("tri", 6, 7, 10);

    @Test
    public void hitungLuasPermukaan() {
        assertEquals(222, primaSegi3.hitungLuasPermukaan(), 0);
    }

    @Test
    public void hitungVolume() {
        assertEquals(210, primaSegi3.hitungVolume(), 0);
    }
}