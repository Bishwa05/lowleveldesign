package snakegame;

import java.util.LinkedList;

public class Snake
{
    private LinkedList<Cell> snakePartList = new LinkedList<>();

    private Cell head;

    public Snake(Cell initPos){
        head = initPos;
        snakePartList.add(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    public void grow(){
        snakePartList.add(head);
    }

    public void move(Cell nextCell){
        System.out.println("Snake is moving to "+nextCell.getRow()+ " "+nextCell.getCol());


    }
}
