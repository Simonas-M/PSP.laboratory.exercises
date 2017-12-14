using PSP.lab3.extensionObject.Extensions;
using System;

namespace PSP.lab3.extensionObject
{
  class Program
  {
    static void Main(string[] args)
    {
      Weapon weapon = new BaseWeapon("This is a base weapon", 33, 50, 88);

      IWeaponExtension bipod = new Bipod();
      IWeaponExtension holster = new Holster();
      IWeaponExtension silencer = new Silencer();

      weapon.RegisterExtension(bipod);
      weapon.RegisterExtension(holster);
      weapon.RegisterExtension(silencer);
      Console.WriteLine(weapon.GetStats());

      weapon.UnregisterExtension(holster);
      Console.WriteLine(weapon.GetStats());

      Console.WriteLine($"Turi Holster?: {weapon.HasExtension(holster)}");
      Console.WriteLine($"Turi Silencer?: {weapon.HasExtension(silencer)}");

      Console.ReadKey();
    }
  }
}
