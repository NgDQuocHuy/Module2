public class TennisGame {
    public static final int LOVE_ALL = 0;
    public static final int FIFTEEN_ALL = 1;
    public static final int THIRTY_ALL = 2;
    public static final int FORTY_ALL = 3;
    public static final String LOVE_ALL_SCORE = "Love-All";
    public static final String FIFTEEN_ALL_SCORE = "Fifteen-All";
    public static final String THIRTY_ALL_SCORE = "Thirty-All";
    public static final String FORTY_ALL_SCORE = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE_SCORE = "Love";
    public static final String FIFTEEN_SCORE = "Fifteen";
    public static final String THIRTY_SCORE = "Thirty";
    public static final String FORTY_SCORE = "Forty";
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;


    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2)
            return getDeuce(scorePlayer1);

        if (scorePlayer1 >= 4 || scorePlayer2 >= 4)
            return getScorePlayerWin(scorePlayer1, scorePlayer2);
        return scorePlayer1 + "-" +scorePlayer2 + getTempScore(score, tempScore);
    }

    private static String getTempScore(String score, int tempScore) {
        switch(tempScore) {
            case LOVE:
                return LOVE_SCORE;
            case FIFTEEN:
                return FIFTEEN_SCORE;
            case THIRTY:
                return THIRTY_SCORE;
            case FORTY:
                return FORTY_SCORE;
        }
        return score;
    }

    private static String getDeuce(int scorePlayer1) {
        switch (scorePlayer1) {
            case LOVE_ALL:
                return LOVE_ALL_SCORE;
            case FIFTEEN_ALL:
                return FIFTEEN_ALL_SCORE;
            case THIRTY_ALL:
                return THIRTY_ALL_SCORE;
            case FORTY_ALL:
                return FORTY_ALL_SCORE;
            default:
                return DEUCE;
        }
    }

    private static String getScorePlayerWin(int scorePlayer1, int scorePlayer2) {
        int minusResult = scorePlayer1 - scorePlayer2;
        switch (minusResult) {
            case 1:
                return ADVANTAGE_PLAYER_1;
            case -1:
                return ADVANTAGE_PLAYER_2;
            case 2:
                return WIN_FOR_PLAYER_1;
            default:
                return WIN_FOR_PLAYER_2;
        }
    }
}
