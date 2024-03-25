package bit.minisys.minicc.parser;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.*;

import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;


public class myParser {

  private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();


  public static Map<String, Object> toMap(ParseTree tree) 
  {
    Map<String, Object> map = new LinkedHashMap<>();
    traverse(tree, map);
    return map;
  }

  public static void traverse(ParseTree tree, Map<String, Object> map) 
  {

    if (tree instanceof TerminalNodeImpl) {
      Token token = ((TerminalNodeImpl) tree).getSymbol();
      
      map.put("type", mygrammarLexer.VOCABULARY.getSymbolicName(token.getType()));
      map.put("value", token.getText());
      map.put("tokenId", token.getType());
    }
    else {
      List<Map<String, Object>> children = new ArrayList<>();
      String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
      map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

      for (int i = 0; i < tree.getChildCount(); i++) {
        Map<String, Object> nested = new LinkedHashMap<>();
        children.add(nested);
        traverse(tree.getChild(i), nested);
      }
    }
  }
  
  public static String read_file(String path) {
         
        BufferedReader br = null;
        StringBuffer sb = null;
        try 
        {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"utf-8")); 
            sb = new StringBuffer();
            String line = null;
            while((line = br.readLine()) != null) 
            {
                sb.append(line);
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                br.close();
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }   
        }
         
        String data = new String(sb); 
		return data;
             
    }

    public String run(String iFile) throws Exception{
    System.out.println("Parseing...");
    String source = read_file(iFile);
    mygrammarLexer lexer = new mygrammarLexer(CharStreams.fromString(source));
    mygrammarParser parser = new mygrammarParser(new CommonTokenStream(lexer));
    

    
    PrintStream ps=new PrintStream(new FileOutputStream(iFile+".json"));
    System.setOut(ps);
    System.out.println(PRETTY_PRINT_GSON.toJson(toMap(parser.compilation_unit())) );
    System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    
	source = read_file(iFile);
    lexer = new mygrammarLexer(CharStreams.fromString(source));
	parser = new mygrammarParser(new CommonTokenStream(lexer));
    
    ParseTree tree = parser.compilation_unit();
    TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
    treeViewer.open();
    
    System.out.println("Parser Completed!(DJX 1120180818)");
    return iFile + ".json";
    
  }
}


