package JavaRush.lvl6;

/*
Блокнот для новых идей
*/

public class NotebookForNewIdeas {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    public static class Idea {
        public String getDescription(){
            return "";      // возвращает любую строку на экран
        }                       // (пиши в кавычках что хочешь)
    }
}
