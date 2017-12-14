using PSP.lab3.decorator.Decorators;
using System;

namespace PSP.lab3.decorator
{
  class Program
  {
    static void Main(string[] args)
    {
      IWeapon weapon = new BaseWeapon();
      Console.WriteLine(weapon.GetStats());

      WeaponWithAccessory decoratedWeapon = new WeaponWithHolster(weapon, "holster");
      Console.WriteLine(decoratedWeapon.GetStats());

      decoratedWeapon = new WeaponWithScope(decoratedWeapon, "scope");
      Console.WriteLine(decoratedWeapon.GetStats());

      decoratedWeapon = (WeaponWithAccessory)decoratedWeapon.RemoveRole("scope");
      Console.WriteLine(decoratedWeapon.GetStats());

      //decoratedWeapon = new WeaponWithSilencer(decoratedWeapon, "silencer");
      //Console.WriteLine(decoratedWeapon.GetStats());

      //decoratedWeapon = new WeaponWithVerticalGrip(decoratedWeapon, "vertical grip");
      //Console.WriteLine(decoratedWeapon.GetStats());

      //Console.WriteLine($"Turi scope?: {decoratedWeapon.HasRole("scope")}");
      //Console.WriteLine($"Turi holster?: {decoratedWeapon.HasRole("holster")}");

      //Console.WriteLine(((WeaponWithVerticalGrip)decoratedWeapon.GetRole("vertical grip")).AddGrip());


      Console.ReadKey();
    }
  }
}
