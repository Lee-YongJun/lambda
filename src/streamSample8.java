import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class streamSample8 {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();
        IntStream.rangeClosed(1,100).forEach(i->{
            boardList.add(new Board(i,"title" + i,"user"+i,LocalDateTime.now()));
        });
        boardList.stream().forEach(System.out::println);
//        IntStream.rangeClosed(1,100).forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
class Board{
    int no;
    String title;
    String user;
    LocalDateTime createDate;
}
