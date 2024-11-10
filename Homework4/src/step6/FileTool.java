package step6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public final class FileTool {
  public static String read(String path) {
    try{
      Scanner scanner = new Scanner(new FileReader(path));
      StringBuilder sb = new StringBuilder();
      while(scanner.hasNextLine()){
        sb.append(scanner.nextLine());
      }
      scanner.close();
      return sb.toString();
    }catch (Exception e){
      e.printStackTrace();
    }

    return null;
    // 读取文件所有内容
  }
  public static void save(String path, String content) {
    try{
      FileWriter writer = new FileWriter(path);
      writer.write(content);
      writer.close();
    }catch (Exception e){
      e.printStackTrace();
    }
    // 保存内容到目标文件
  }
}
