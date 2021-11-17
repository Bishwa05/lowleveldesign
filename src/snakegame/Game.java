package snakegame;

public class Game
{
    public static final int DIRECTION_NONE = 0, DIRECTION_RIGHT = 1, DIRECTION_LEFT = -1,
    DIRECTION_UP = 2, DIRECTION_DOWN = 3;

    private Snake snake;
    private Board board;
    private int direction;
    private boolean gameOver;


    public Game(Snake snake, Board board){
        this.snake = snake;
        this.board = board;
    }

    public Snake getSnake ()
    {
        return snake;
    }

    public void setSnake (Snake snake)
    {
        this.snake = snake;
    }

    public Board getBoard ()
    {
        return board;
    }

    public void setBoard (Board board)
    {
        this.board = board;
    }

    public int getDirection ()
    {
        return direction;
    }

    public void setDirection (int direction)
    {
        this.direction = direction;
    }

    public boolean isGameOver ()
    {
        return gameOver;
    }

    public void setGameOver (boolean gameOver)
    {
        this.gameOver = gameOver;
    }


    private Cell getNextCell(Cell currentPosition){
        System.out.println("Going top find next cell");

        int row = currentPosition.getRow();
        int col = currentPosition.getCol();

        if(direction == DIRECTION_LEFT) col--;

        if(direction == DIRECTION_RIGHT) col++;

        if(direction == DIRECTION_UP) row--;

        if(direction == DIRECTION_DOWN) row++;

        Cell nextCell = board.getCells()[row][col];

        return nextCell;
    }

    public void update(){
        System.out.println("Going to update the game");

        if(!gameOver){
            if(direction != DIRECTION_NONE){
                Cell nextCell = getNextCell(snake.getHead());

                if(snake.checkCrash(nextCell)){
                    setDirection(DIRECTION_NONE);
                    gameOver = true;
                } else {
                    snake.move(nextCell);
                    if(nextCell.getCellType()== CellType.FOOD){
                        snake.grow();
                        board.generateFoods();
                    }
                }
            }
        }
    }


    public static void main(String[] args){
        System.out.println("Going to start Game");

        Cell initPos = new Cell(0,0);
        Snake initSnake = new Snake(initPos);
        Board board = new Board(10, 10);
        Game newGame = new Game(initSnake, board);
        newGame.gameOver = false;
        newGame.direction = DIRECTION_RIGHT;


        for(int i =0; i<5; i++){
            if(i ==2) newGame.board.generateFoods();
            newGame.update();

            if(i ==3)
                newGame.direction = DIRECTION_RIGHT;
            if(newGame.gameOver = true) break;
        }
    }
}
