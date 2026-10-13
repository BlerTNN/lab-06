package com.example.lab6

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class WizardTest {
    private lateinit var evilWizard: Wizard

    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }

    @Test
    fun castSpell_explosion_successful() {
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(30, damageDealt)
        assertEquals(20, evilWizard.mana)
    }

    @Test
    fun castSpell_explosion_unsuccessful() {
        evilWizard.mana = 5
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(0, damageDealt)
        assertEquals(5, evilWizard.mana)
    }

    @Test
    fun castSpell_frostbite_successful() {
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(20, damageDealt)
        assertEquals(25, evilWizard.mana)
    }

    @Test
    fun castSpell_frostbite_unsuccessful() {
        evilWizard.mana = 4
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(0, damageDealt)
        assertEquals(4, evilWizard.mana)
    }
}
