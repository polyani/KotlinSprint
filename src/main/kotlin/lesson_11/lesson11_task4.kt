package lesson_11

class CategoryRecipe(
    val categoryId: Long,
    val categoryName: String,
    val nameRecipe: List<Recipe>
) {}

class Recipe(
    val recipeId: Long,
    val nameRecipe: String,
    val ingredients: Set<Ingredients>,
) {}

class Ingredients(val nameIngredient: String, val quantityIngredient: Long, val measure: Measure) {
    // сравнение объектов(переопределение equals)
    override fun equals(other: Any?): Boolean {
        other ?: return false
        // если объект other не является объектом класса Ingredients то ложь
        if (other !is Ingredients) return false
        // если хэшкоды не совпадают, то возвращаем ложь
        if (other.hashCode() != this.hashCode()) return false
        // если объекты не равны по критериям, то вернуть ложь
        if (other.nameIngredient != this.nameIngredient) return false
        return true
    }

    override fun hashCode(): Int {
        return nameIngredient.hashCode()
    }
}

enum class Measure(val code: String, val description: String) {
    TABLE_SPOON("Tabspoon", "ст.л"),
    TEA_SPOON("Teaspoon", "ч.л"),
    GRAMM("Gramm", "гр.")
}


fun main() {

}