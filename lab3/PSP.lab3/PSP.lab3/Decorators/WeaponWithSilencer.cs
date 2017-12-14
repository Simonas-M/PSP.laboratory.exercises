namespace PSP.lab3.decorator.Decorators
{
  class WeaponWithSilencer : WeaponWithAccessory
  {
    public WeaponWithSilencer(IWeapon weapon, string roleName) : base(weapon, roleName) { }

    public override string GetDescription()
    {
      return $"{base.GetDescription()}, with silencer";
    }

    public override int GetRateOfFire()
    {
      return base.GetRateOfFire() - 6;
    }

    public override int GetDamage()
    {
      return base.GetDamage() - 5;
    }
  }
}
