public class ActGame extends Thread{
    
    private boolean alive;
    private int velocity;
    private GameView gameView;
    private int[] dim;
    private boolean pause;
    
    public ActGame(int velocity, GameView gameView, int[] dim){
        this.alive = true;
        this.velocity = velocity;
        this.gameView = gameView;
        this.dim = dim;
        this.pause = false;
    }
    
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }
    
    public int getVelocity(){
        return velocity;
    }
    
    public void setPause(boolean pause){
        this.pause = pause;
    }
    
    public void setAlive(boolean alive){
        this.alive = alive;
    }
    
    private boolean myIsAlive(){
        return alive;
    }
    
    private void move(){
        if (!pause){
            int x,y,xMov,yMov;
            x = gameView.getPosition()[0];
            y = gameView.getPosition()[1];
            xMov = gameView.getMovement()[0];
            yMov = gameView.getMovement()[1];

            int[] newPos = {x + 5*xMov, y + 5*yMov};

            gameView.setPosition(newPos);
            
            if((newPos[0] < 1) || (newPos[1] < 1) || ((newPos[0] + gameView.getHeroSize()[0]) > dim[0]) || ((newPos[1] + gameView.getHeroSize()[1]) > dim[1])){
                gameView.endGame();
            }
        }
    }
    
    @Override
    public void run(){
        while(myIsAlive()){
            try{
                Thread.sleep(100/velocity * 50);
            }catch (InterruptedException ex){
                System.err.println("ERROR. Something gone wrong with actGame class object");
            }
            move();  
        }      
    }       
}
