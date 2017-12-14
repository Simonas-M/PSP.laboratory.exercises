namespace PSP.lab3.decorator.Decorators
{
    class WeaponWithHolster : WeaponWithAccessory
    {
        public WeaponWithHolster(IWeapon weapon, string roleName) : base(weapon, roleName) { }

        public override string GetDescription()
        {
            return $"{base.GetDescription()}, with holster";
        }
    }
}
