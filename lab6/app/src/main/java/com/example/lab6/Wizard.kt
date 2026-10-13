package com.example.lab6

/**
 * Represents a wizard that uses mana to cast spells.
 *
 * Casting a supported spell requires enough mana and deals damage based on
 * the wizard's spell power. Failed spells leave mana unchanged.
 *
 * @property name the wizard's name
 * @property mana the mana currently available for casting spells
 * @property spellPower the base power used to calculate spell damage
 */
class Wizard(val name: String, var mana: Int, var spellPower: Int) {
    /**
     * Casts a spell and returns the damage dealt.
     *
     * Supported spells:
     * - "Explosion": costs 10 mana and deals 3 times [spellPower] damage.
     * - "Frostbite": costs 5 mana and deals 2 times [spellPower] damage.
     *
     * If mana is insufficient or the spell name is invalid, returns 0 without
     * consuming mana. Spell names are case-sensitive.
     *
     * @param spell the name of the spell to cast
     * @return the damage dealt, or 0 if the spell fails
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0
            }
            else -> return 0
        }
    }
}
