namespace PSP.lab3.extensionObject.Extensions
{
  class VerticalGrip : IWeaponExtension
  {
    public int ModifyAccuracy(int accuracy)
    {
      return accuracy + 30;
    }

    public int ModifyDamage(int damage)
    {
      return damage;
    }

    public string ModifyDescription(string description)
    {
      return $"{description}, with vertical grip";
    }

    public int ModifyRateOfFire(int rateOfFire)
    {
      return rateOfFire;
    }
  }
}
