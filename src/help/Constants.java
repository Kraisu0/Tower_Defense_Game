package help;

public class Constants {
    public static class Direction{
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class Tiles{
        public static final int ROAD_TILE = 0;
        public static final int OTHER_TILE = 1;

    }

    public static class Enemies {

        public static final int EASY_UNIT = 0;
        public static final int NORMAL_UNIT = 1;
        public static final int HARD_UNIT = 2;
        public static final int SUPER_UNIT = 3;
        public static final int TURBO_HARD_UNIT = 4;
        public static final int TUTORIAL_UNIT = 5;
        public static final int OWN_UNIT = 6;

        public static int GetReward(int enemyType) {
            switch (enemyType){
                case TUTORIAL_UNIT:
                    return 1;
                case EASY_UNIT:
                    return 5;
                case NORMAL_UNIT:
                    return 10;
                case HARD_UNIT:
                    return 20;
                case SUPER_UNIT:
                    return 40;
                case TURBO_HARD_UNIT:
                    return 45;
                case OWN_UNIT:
                    //TODO
                    return 1;
            }
            return 0;
        }

        public static float getSpeed(int enemyType){
            switch (enemyType){
                case TUTORIAL_UNIT:
                    return 0.24f;
                case EASY_UNIT:
                    return 0.4f;
                case NORMAL_UNIT:
                    return 0.8f;
                case HARD_UNIT:
                    return 1f;
                case SUPER_UNIT:
                    return 0.4f;
                case TURBO_HARD_UNIT:
                    return 1.2f;
                case OWN_UNIT:
                    return 0.75f;
            }
            return 0;
        }

        public static int GetStartHealth(int enemyType){
            switch (enemyType){
                case TUTORIAL_UNIT:
                    return 20;
                case EASY_UNIT:
                    return 35;
                case NORMAL_UNIT:
                    return 60;
                case HARD_UNIT:
                    return 85;
                case SUPER_UNIT:
                    return 115;
                case TURBO_HARD_UNIT:
                    return 100;
                case OWN_UNIT:
                    return 10;
            }
            return  0;
        }
    }

    public static class Towers{
        public static final int BASIC = 0; //typ BASIC
        public static final int MACHINE = 1; //szybszy niż BASIC
        public static final int BRUTAL = 2; //mocniejszy niż BASIC
        public static final int EXTRA = 3; //ulepszony BASIC
        public static final int FAST_MACHINE = 4; //szybszy niż MACHINE
        public static final int ONE_HIT = 5; //mocniejszy niż BRUTAL
        public static final int CRAZY_CANNON = 6; //najmocniejsza wieża
        public static final int DEUS_EX_MACHINA = 7; //testowy
        public static final int OWN_TOWER = 8;

        public static int GetTowerCost(int towerType) {
            switch (towerType){
                case BASIC:
                    return 30;
                case MACHINE:
                    return 45;
                case BRUTAL:
                    return 60;
                case EXTRA:
                    return 100;
                case FAST_MACHINE:
                    return  200;
                case ONE_HIT:
                    return 250;
                case CRAZY_CANNON:
                    return 400;
                case DEUS_EX_MACHINA:
                    return 450;
                case OWN_TOWER:
                    // TODO
                    return 1;
            }
            return 0;
        }

        public static String GetName(int towerType){
            switch (towerType){
                case BASIC:
                    return "Basic";
                case MACHINE:
                    return "Machine";
                case BRUTAL:
                    return "Brutal";
                case EXTRA:
                    return  "Extra";
                case FAST_MACHINE:
                    return  "Fast Machine";
                case ONE_HIT:
                    return  "One Hit";
                case CRAZY_CANNON:
                    return  "Crazy Cannon";
                case DEUS_EX_MACHINA:
                    return  "Deus Ex Machina";
                case OWN_TOWER:
                    return "Own Tower";
            }
            return null;
        }


        public static float getStartDmg(int towerType){
            switch (towerType){
                case BASIC:
                    return 10;
                case MACHINE:
                    return 10;
                case BRUTAL:
                    return 30;
                case EXTRA:
                    return 30;
                case FAST_MACHINE:
                    return 25;
                case ONE_HIT:
                    return 120;
                case CRAZY_CANNON:
                    return 50;
                case DEUS_EX_MACHINA:
                    return 500;
                case OWN_TOWER:
                    return 1;
            }
            return 0;
        }

        public static float getDefaultRange(int towerType){
            switch (towerType){
                case BASIC:
                    return 100;
                case MACHINE:
                    return 100;
                case BRUTAL:
                    return 100;
                case EXTRA:
                    return 100;
                case FAST_MACHINE:
                    return 100;
                case ONE_HIT:
                    return 100;
                case CRAZY_CANNON:
                    return 100;
                case DEUS_EX_MACHINA:
                    return 100;
                case OWN_TOWER:
                    return 1;
            }
            return 0;

        }

        public static float getDefaultCooldown(int towerType){
            switch (towerType){
                case BASIC:
                    return 50;
                case MACHINE:
                    return 50;
                case BRUTAL:
                    return 50;
                case EXTRA:
                    return 50;
                case FAST_MACHINE:
                    return 15;
                case ONE_HIT:
                    return 50;
                case CRAZY_CANNON:
                    return 50;
                case DEUS_EX_MACHINA:
                    return 50;
                case OWN_TOWER:
                    return 1;
            }
            return 0;

        }
    }

    public static class ProjectTiles{
        public static final int BASIC_AMMO = 0; //typ BASIC
        public static final int MACHINE_AMMO = 1; //typ MACHINE
        public static final int HEAVY_AMMO = 2; //typ BRUTAL
        public static final int EXTRA = 3; //ulepszony BASIC
        public static final int FAST_MACHINE = 4; //szybszy niż MACHINE
        public static final int ONE_HIT = 5; //mocniejszy niż BRUTAL
    }
}