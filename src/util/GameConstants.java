package util;

public class GameConstants {
    /** Sprite pixels, Tile size on the screen */
    public static final int ORIGINAL_TILE_SIZE = 18;
    public static final int SCALE = 2;
    
    public static final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE;
    public static final int MAX_SCREEN_COL = 33;
    public static final int MAX_SCREEN_ROW = 21;
    public static final int SCREEN_WIDTH = MAX_SCREEN_COL * TILE_SIZE;
    public static final int SCREEN_HEIGHT = MAX_SCREEN_ROW * TILE_SIZE;

    // Center of the screen
    public static final double DEFAULT_SPAWN_X = (double) ((MAX_SCREEN_COL - 1) * TILE_SIZE) / 2;
    public static final double DEFAULT_SPAWN_Y = (double) ((MAX_SCREEN_ROW - 1) * TILE_SIZE) / 2;

    // Frame-Rate
    public static final int FPS = 60;

    /** UI Constants */
    public class UI {
        public static final int POWERUP_FRAME_SIDE = 20 * SCALE;
    }

    /** Game Constants */
    public class Game {
        /* Total frames = FPS * Seconds */
        public static final int BASE_ROUND_DURATION = FPS * 60; // 45 seconds
        public static final int INCREMENT_DURATION = FPS * 10;  // + 10 seconds after each round 

        public static final int PLAYER_LIVES = 3; 

    }

    /* Player Constants */
    public class Player {
        // Durations
        public static final int SPEED_BOOST_DURATION = FPS * 15; // 15 seconds
        public static final int SHOTGUN_DURATION = FPS * 12; // 12 seconds
        public static final int MACHINE_GUN_DURATION = FPS * 12; // 12 seconds
        public static final int OCTOSHOT_DURATION = FPS * 10; // 10 seconds

        // Stats
        public static final double PLAYER_DEFAULT_SPEED = 2.5d;
        public static final double PLAYER_BOOSTED_SPPED = 1.0d;
    }

    // Hide constructor to avoid instantiating GameConstants
    // as GameConstants is class used to store static constants
    private GameConstants() { }
}
