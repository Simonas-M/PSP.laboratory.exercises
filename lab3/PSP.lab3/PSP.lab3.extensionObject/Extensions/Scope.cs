namespace PSP.lab3.extensionObject.Extensions
{
  class Scope : IWeaponExtension
  {
    public int ModifyAccuracy(int accuracy)
    {
      return accuracy * 4;
    }

    public int ModifyDamage(int damage)
    {
      return damage;
    }

    public string ModifyDescription(string description)
    {
      return $"{description}, with scope";
    }

    public int ModifyRateOfFire(int rateOfFire)
    {
      return rateOfFire;
    }
  }
}
