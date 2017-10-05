namespace PSP.labExcercises_strategy
{
    class Recipe
    {
        private IRecipeDetails _recipe;

        public Recipe(IRecipeDetails recipe)
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
            _recipe.GetPrice();
        }
    }
}
