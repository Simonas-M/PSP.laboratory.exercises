namespace PSP.lab3.extensionObject.Extensions
{
  class Holster : IWeaponExtension
  {
    public int ModifyAccuracy(int accuracy)
    {
      return accuracy;
    }

    public int ModifyDamage(int damage)
    {
      return damage;
    }

    public string ModifyDescription(string description)
    {
      return $"{description}, with holster";
    }

    public int ModifyRateOfFire(int rateOfFire)
    {
      return rateOfFire;
    }
  }
}
