namespace PSP.lab3.decorator
{
  abstract class WeaponWithAccessory : IWeapon
  {
    protected IWeapon weapon;
    protected string roleName;

    public WeaponWithAccessory(IWeapon weapon, string roleName)
    {
      this.weapon = weapon;
      this.roleName = roleName;
    }

    public virtual string GetDescription()
    {
      return weapon.GetDescription();
    }

    public virtual int GetRateOfFire()
    {
      return weapon.GetRateOfFire();
    }

    public virtual int GetDamage()
    {
      return weapon.GetDamage();
    }

    public virtual int GetAccuracy()
    {
      return weapon.GetAccuracy();
    }

    public string GetStats()
    {
      return $"Description: {GetDescription()}" +
             $"\nRate of fire: {GetRateOfFire()}" +
             $"\nDamage: {GetDamage()}" +
             $"\nAccuracy: {GetAccuracy()}";
    }

    public IWeapon GetBase()
    {
      if (weapon is WeaponWithAccessory decorator)
        return decorator.GetBase();
      return weapon;
    }

    public bool HasRole(string role)
    {
      return GetRole(role) != null;
    }

    public WeaponWithAccessory GetRole(string role)
    {
      if (roleName.Equals(role))
        return this;
      if (weapon is WeaponWithAccessory decorator)
        return decorator.GetRole(role);
      return null;
    }

    public IWeapon RemoveRole(string role)
    {
      if (roleName == role)
        return weapon;
      if (weapon is WeaponWithAccessory decorator)
      {
        if (decorator.roleName == role)
        {
          weapon = decorator.weapon;
          return this;
        }
        decorator.RemoveRole(role);
      }
      return this;
    }
  }
}
