namespace PSP.lab3.extensionObject.Extensions
{
  class Bipod : IWeaponExtension
  {
    public int ModifyAccuracy(int accuracy)
    {
      return accuracy * 2;
    }

    public int ModifyDamage(int damage)
    {
      return damage;
    }

    public string ModifyDescription(string description)
    {
      return $"{description}, with bipod";
    }

    public int ModifyRateOfFire(int rateOfFire)
    {
      return rateOfFire / 2;
    }
  }
}
