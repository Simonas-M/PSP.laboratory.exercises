namespace PSP.lab3.extensionObject.Extensions
{
  class Silencer : IWeaponExtension
  {
    public int ModifyAccuracy(int accuracy)
    {
      return accuracy;
    }

    public int ModifyDamage(int damage)
    {
      return damage - 5 > 0 ? damage - 5 : damage;
    }

    public string ModifyDescription(string description)
    {
      return $"{description}, with silencer";
    }

    public int ModifyRateOfFire(int rateOfFire)
    {
      return rateOfFire - 6 > 0 ? rateOfFire - 6 : rateOfFire;
    }
  }
}
