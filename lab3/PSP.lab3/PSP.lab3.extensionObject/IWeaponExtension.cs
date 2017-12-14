namespace PSP.lab3.extensionObject
{
  internal interface IWeaponExtension
  {
    string ModifyDescription(string description);

    int ModifyRateOfFire(int rateOfFire);

    int ModifyDamage(int damage);

    int ModifyAccuracy(int accuracy);

  }
}