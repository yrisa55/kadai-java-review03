package baseball;

public class BaseBallTeam {
        //　カプセル化を使って以下4つのフィールドをBaseBallTeamに持たせる
        private String name;
        private int win;
        private int lose;
        private int draw;

        //  コンストラクタ:初期値を設定
        public BaseBallTeam(String name, int win, int lose, int draw ) {
            this.name = name;
            this.win = win;
            this.lose = lose;
            this.draw = draw;
        }

        // 引数なしのコンストラクタ
        public BaseBallTeam() {
        }

        // ゲッターメソッド（フィールドの値を取得するためのメソッド）
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWin() {
            return win;
        }

        // セッターメソッド（フィールドの値を設定するためのメソッド）
        public void setWin(int win) {
            this.win = win;
        }

        public int getLose() {
            return lose;
        }

        public void setLose(int lose) {
            this.lose = lose;
        }

        public int getDraw() {
            return draw;
        }

        public void setDraw(int draw) {
            this.draw = draw;
        }

        // report
        public void report () {
            double result = this.getRate(win, lose);
            System.out.println(name + "の"+"2022年の成績は "+ win + "勝 "+ lose + "敗 " + draw + "分、勝率は"+ result + "です。");
        }

        //  勝率　getRateメソッドで
        public double getRate(int win, int lose) {
            double result = (double)win/(win + lose);
                    return result;
        }

    }


