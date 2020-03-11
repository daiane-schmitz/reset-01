package Batalhas;

public class Calculos {

    int poderFinalAtaqueEspada (int poderAtaqueArma, int ataqueGuerreiro) {
        return (poderAtaqueArma * ataqueGuerreiro);
    }

    int poderFinalAtaqueMachado (int poderAtaqueArma, int ataqueBarbaro) {
        return (poderAtaqueArma * ataqueBarbaro);

    int poderFinalAtaqueArcano (int poderMagia, int ataqueFeiticeiro) {
        return (poderMagia * ataqueFeiticeiro);
    }

    int poderFinalAtaqueFogo (int poderMagia, int ataqueMago) {
        return (poderMagia * ataqueMago);
    }

    int IntensidadePoderDivino (int intensidadePoderDivino, int ataqueClerigo) {
        return (intensidadePoderDivino * ataqueClerigo);
    }

}
