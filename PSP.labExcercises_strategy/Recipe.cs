namespace PSP.labExcercises_strategy
{
    public class Recipe
    {
        private IRecipeSteps _recipe;

        public Recipe(IRecipeSteps recipe)
        {
            _recipe = recipe;
        }

        public void GetRecipe()
        {
            _recipe.PrepareIngredients();
            foreach (var step in _recipe.GetSteps())
            {
                _recipe.Execute(step);
            }
            _recipe.Finally();
        }
    }
}
