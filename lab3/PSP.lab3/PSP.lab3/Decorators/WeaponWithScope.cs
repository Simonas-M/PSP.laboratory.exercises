namespace PSP.lab3.decorator.Decorators
{
  class WeaponWithScope : WeaponWithAccessory
  {
    public WeaponWithScope(IWeapon weapon, string roleName) : base(weapon, roleName) { }

    public override string GetDescription()
    {
      return $"{base.GetDescription()}, with scope";
    }

    public override int GetAccuracy()
    {
      return base.GetAccuracy() + 20;
    }
  }
}
