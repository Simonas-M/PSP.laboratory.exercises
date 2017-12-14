namespace PSP.lab3.extensionObject
{
  class BaseWeapon : Weapon
  {
    public BaseWeapon(string description, int rateOfFire, int damage, int accuracy)
      : base(description, rateOfFire, damage, accuracy) { }
  }
}
