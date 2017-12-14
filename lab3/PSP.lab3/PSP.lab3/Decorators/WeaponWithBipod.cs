namespace PSP.lab3.decorator.Decorators
{
  class WeaponWithBipod : WeaponWithAccessory
  {
    public WeaponWithBipod(IWeapon weapon, string roleName) : base(weapon, roleName) { }

    public override string GetDescription()
    {
      return $"{base.GetDescription()}, with bipod";
    }

    public override int GetAccuracy()
    {
      return base.GetAccuracy() + 10;
    }

    public override int GetRateOfFire()
    {
      return base.GetRateOfFire() - 20;
    }
  }
}
