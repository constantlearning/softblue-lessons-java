package _05_modificadores_de_acesso_construtores_elementos_estaticos.exercicio_02;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Data {

    private Integer ano, mes, dia, hora, minuto, segundo;
    public static final int FORMATO_12H = 12;
    public static final int FORMATO_24H = 24;

    public Data(Integer ano, Integer mes, Integer dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public Data(Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto, Integer segundo) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void imprimir(Integer formato) throws BusinessException {

        String data = "";

        if (!formatoValido(formato)) {
            throw new BusinessException("Formato inválido.");
        }

        if (formato.equals(FORMATO_12H)) {
            data = obterDataFormato12Horas();
        }

        if (formato.equals(FORMATO_24H)) {
            data = obterDataFormat24Horas();
        }

        System.out.println(data);
    }

    private boolean formatoValido(Integer formato) {
        return formato.equals(FORMATO_12H) || formato.equals(FORMATO_24H);
    }

    private String getDiaMesAno() {
        String data = "";

        data += this.dia;
        data += "/";
        data += this.mes;
        data += "/";
        data += this.ano;
        return data;
    }

    private String obterDataFormat24Horas() {

        String data = getDiaMesAno();
        data += " ";

        if (haveHourMinuteAndSecond()) {

            data += this.hora;
            data += ":";
            data += this.minuto;
            data += ":";
            data += this.segundo;
        }

        return data;
    }

    private String obterDataFormato12Horas() {

        String data = getDiaMesAno();
        data += " ";
        String ampm;

        if (haveHourMinuteAndSecond()) {

            if (this.hora > 12) {
                data += this.hora - 12;
                ampm = " PM";
            }
            else{
                data += this.hora;
                ampm = " AM";
            }

            data += ":";
            data += this.minuto;
            data += ":";
            data += this.segundo;
            data += ampm;
        }

        return data;
    }

    private boolean haveHourMinuteAndSecond() {
        return this.hora != null && this.minuto != null && this.segundo != null;
    }

}
