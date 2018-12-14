package posthtml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import workload.Expr;
import workload.Predef;

/**
 *
 * @author jefferson
 */
public class CalcJS {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("eli.txt"));

		Map<String, Expr> ctx = new HashMap<>();
		ctx.put("sin", Predef.SIN);
		ctx.put("cos", Predef.COS);
		ctx.put("tan", Predef.TAN);
		ctx.put("write", Predef.WRITE);
		ctx.put("draw", Predef.DRAW);
		ctx.put("drawline", Predef.DRAWLINE);

		FileWriter fw = new FileWriter("teste.html");
		fw.write("<canvas id='myCanvas' width='720' height='1280'></canvas>\n");
		fw.write("<script>\n");
		//PARA REDUZIR TEMPO DE PROCESSAMENTO O ELEMENTO DO HTML EH BUSCADO APENAS UMA VEZ
		fw.write("var canvas = document.getElementById(\"myCanvas\");");
		fw.write("var ctx = canvas.getContext('2d');");
		fw.flush();


		String code = readInput(br);
		ANTLRInputStream input = new ANTLRInputStream(code);
		posthtml.CalcLexer lexer = new posthtml.CalcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		posthtml.CalcParser parser = new CalcParser(tokens);

		CalcParser.InicioContext e = parser.inicio();

		List<Expr> xs = e.result;

		Expr ans = Expr.UNIT;
		for (Expr x : xs) {
			ans = x.eval(ctx, fw, 0);
			fw.write("\n");
			fw.flush();
		}

		fw.write("</script>");
		fw.flush();

	}

	static String readInput(BufferedReader br) throws IOException {
		StringBuilder sb = new StringBuilder();

		while (br.ready()) {
			String line = br.readLine();
			sb.append(line);
			sb.append(" ");
		}

		return sb.toString();
	}
}