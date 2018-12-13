/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author elmr
 */
public class UserFunction extends Sketch{
    private final String fname;
    private final List<Expr> args;
    private Block code;
    
    public UserFunction(String fname, List<Expr> args,Block code) {
        this.fname = fname;
        this.args = args;
        this.code = code;
    }

/*
 =========================================================================================
 |AINDA NAO FOI TESTADO, FIZ SEM ESTAR NO NETBEANS, PROVAVELMENTE A CLASSE PRECISE SER   |
 |ALTERADA, POREM O METODO ABAIXO SEGUE A IDEIA DO QUE PRECISA SER FEITO PARA QUE SEJA   |
 |POSSIVEL AVALIAR UMA FUNCAO CRIADA PELO USUARIO, SE EU ALGUEM PEGAR PRIMEIRO QUE EU    |
 |PELO AMOR DE DEUS RESOLVE ISSO                                                         |
 =========================================================================================
*/

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        ctx.put(this.fname, new Function(null){
            @Override
            public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) {
                if (params.size() != this.args.size()){
                    String erroMsg = String.formart("FUNCTION ERRO: Wrong number of arguments. Expecting %d; Found: %d.",this.args.size(),params.size());
                    throw new IllegalArgumentException(erroMsg);
                }
                Map<String, Expr> functionCtx = new HashMap<>();
                int parameterIndex = 0;
                For(Expr data : params){
                    functionCtx.put(this.args.get(parameterIndex),data);
                    parameterIndex++;
                }
                return this.code.eval(functionCtx,fw,identLevel,false);
            }
        })
        return this;
    }
    
}
