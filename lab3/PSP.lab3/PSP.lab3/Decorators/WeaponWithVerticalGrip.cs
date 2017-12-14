namespace PSP.lab3.decorator.Decorators
{
  class WeaponWithVerticalGrip : WeaponWithAccessory
  {
    public WeaponWithVerticalGrip(IWeapon weapon, string roleName) : base(weapon, roleName) { }

    public override string GetDescription()
    {
      return $"{base.GetDescription()}, with vertical grip";
    }

    public override int GetAccuracy()
    {
      return base.GetAccuracy() + AddGrip();
    }

    /**
     * increases weapon accuracy by 50% base damage
     */
    public int AddGrip()
    {
      return GetBase().GetAccuracy() / 2;
    }
  }
}
