namespace PSP.lab3.decorator
{
  interface IWeapon
  {
    string GetDescription();

    int GetRateOfFire();

    int GetDamage();

    int GetAccuracy();

    string GetStats();
  }
}
