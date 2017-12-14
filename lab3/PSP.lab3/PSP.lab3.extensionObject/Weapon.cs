using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.lab3.extensionObject
{
  abstract class Weapon
  {
    private Dictionary<string, IWeaponExtension> _extensions = new Dictionary<string, IWeaponExtension>();
    private string _description;
    private int _rateOfFire;
    private int _damage;
    private int _accuracy;

    public Weapon(string description, int rateOfFire, int damage, int accuracy)
    {
      _description = description;
      _rateOfFire = rateOfFire;
      _damage = damage;
      _accuracy = accuracy;
    }

    public string GetDescription()
    {
      var modifiedDescription = _description;
      foreach (var extension in _extensions.Values)
      {
        modifiedDescription = extension.ModifyDescription(modifiedDescription);
      }
      return modifiedDescription;
    }

    public int GetRateOfFire()
    {
      var modifiedRateOfFire = _rateOfFire;
      foreach (var extension in _extensions.Values)
      {
        modifiedRateOfFire = extension.ModifyRateOfFire(modifiedRateOfFire);
      }
      return modifiedRateOfFire;
    }

    public int GetDamage()
    {
      var modifiedDamage = _damage;
      foreach (var extension in _extensions.Values)
      {
        modifiedDamage = extension.ModifyDamage(modifiedDamage);
      }
      return modifiedDamage;
    }

    public int GetAccuracy()
    {
      var modifiedAccuracy = _accuracy;
      foreach (var extension in _extensions.Values)
      {
        modifiedAccuracy = extension.ModifyAccuracy(modifiedAccuracy);
      }
      return modifiedAccuracy;
    }

    public string GetStats()
    {
      return $"Description: {GetDescription()}" +
             $"\nRate of fire: {GetRateOfFire()}" +
             $"\nDamage: {GetDamage()}" +
             $"\nAccuracy: {GetAccuracy()}";
    }
    
    public void RegisterExtension(IWeaponExtension extension)
    {
      string extensionName = extension.GetType().FullName;
      if (!_extensions.ContainsKey(extensionName))
        _extensions.Add(extensionName, extension);
      else
        throw new ArgumentException($"Extension: {extensionName} already registered");
    }

    public void UnregisterExtension(IWeaponExtension extension)
    {
      if (_extensions.ContainsValue(extension))
        _extensions.Remove(_extensions.First(x => x.Value == extension).Key);
      else
        throw new ArgumentException($"Extension {extension.GetType().FullName} not yet registered");
    }

    public bool HasExtension(IWeaponExtension extension)
    {
      return _extensions.ContainsValue(extension);
    }
  }
}
