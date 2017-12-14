namespace PSP.lab3.decorator
{
  class BaseWeapon : IWeapon
  {
    public string GetDescription()
    {
      return "This is a base weapon";
    }

    public int GetRateOfFire()
    {
      return 22;
    }

    public int GetDamage()
    {
      return 100;
    }

    public int GetAccuracy()
    {
      return 65;
    }

    public string GetStats()
    {
      return $"Description: {GetDescription()}" +
             $"\nRate of fire: {GetRateOfFire()}" +
             $"\nDamage: {GetDamage()}" +
             $"\nAccuracy: {GetAccuracy()}";
    }
  }
}
