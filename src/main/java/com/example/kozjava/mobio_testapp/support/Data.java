package com.example.kozjava.mobio_testapp.support;

import com.example.kozjava.mobio_testapp.R;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Model> createRedstoneList(){
        ArrayList<Model> redstoneList = new ArrayList<Model>(){{
            add(new Model(R.drawable.mob_pig, "Информация"));
            add(new Model(R.drawable.mob_pig, "Обозначение"));
            add(new Model(R.drawable.mob_pig, "Схемы"));
        }};
        return redstoneList;
    }
    public static ArrayList<Model> createGameplayList(){
        ArrayList<Model> gameplayList = new ArrayList<Model>(){{
            add(new Model(R.drawable.mob_villager,"Фейерверки"));
            add(new Model(R.drawable.mob_villager,"Деревни жителей"));
            add(new Model(R.drawable.mob_creeper,"Торговля"));
            add(new Model(R.drawable.mob_pig,"Шахты"));
            add(new Model(R.drawable.mob_villager,"День/Ночь"));
            add(new Model(R.drawable.mob_creeper,"Сложность"));
            add(new Model(R.drawable.mob_pig,"Сокровищницы"));
            add(new Model(R.drawable.mob_creeper,"Опыт"));
            add(new Model(R.drawable.mob_creeper,"Размножение"));
        }};
        return gameplayList;
    }

    public static ArrayList<Model> createMobsList(){
        ArrayList<Model> mobsList = new ArrayList<Model>(){{
            add(new Model(R.drawable.mob_villager,"Боссы"));
            add(new Model(R.drawable.mob_creeper,"Враждебные"));
            add(new Model(R.drawable.mob_creeper,"Другие"));
            add(new Model(R.drawable.mob_creeper,"Дружелюбные"));
            add(new Model(R.drawable.mob_creeper,"Нейтральные"));
        }};
        return mobsList;
    }

    public static ArrayList<Model> createRecipesList(){
        ArrayList<Model> recipesList = new ArrayList<Model>(){{
            add(new Model(R.drawable.mob_villager,"Основные"));
            add(new Model(R.drawable.mob_villager,"Блоки"));
            add(new Model(R.drawable.mob_creeper,"Инструменты"));
            add(new Model(R.drawable.mob_villager,"Оружие"));
            add(new Model(R.drawable.mob_pig,"Броня"));
            add(new Model(R.drawable.mob_villager,"Транспорт"));
            add(new Model(R.drawable.mob_pig,"Механизмы"));
            add(new Model(R.drawable.mob_pig,"Еда"));
            add(new Model(R.drawable.mob_creeper,"Прочее"));
        }};
        return recipesList;
    }

    public static ArrayList<Model> createCharmsList() {
        ArrayList<Model> charmsList = new ArrayList<Model>() {{
            add(new Model(R.drawable.mob_pig, "Для брони"));
            add(new Model(R.drawable.mob_creeper, "Для оружия"));
            add(new Model(R.drawable.mob_pig, "Для инструментов"));

        }};
        return charmsList;
    }

    public static ArrayList<Model> createPotionList() {
        ArrayList<Model> potionList = new ArrayList<Model>() {{
            add(new Model(R.drawable.mob_pig, "Ифнормация"));
            add(new Model(R.drawable.mob_creeper, "Первичные"));
            add(new Model(R.drawable.mob_pig, "Вторичные"));
            add(new Model(R.drawable.mob_pig, "Третичные"));

        }};
        return potionList;
    }



}
