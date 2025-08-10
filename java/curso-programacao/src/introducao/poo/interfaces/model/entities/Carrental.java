package introducao.poo.interfaces.model.entities;

import introducao.poo.exeveiculo.entities.Veiculo;


import java.time.LocalDateTime;

public class Carrental {
    private LocalDateTime start;
    private LocalDateTime finish;
    private Veiculo veiculo;
    private introducao.poo.interfaces.model.model.heloo.entities.Invoice invoice;

    public Carrental(LocalDateTime start, LocalDateTime finish, Veiculo veiculo, introducao.poo.interfaces.model.model.heloo.entities.Invoice invoice) {
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;
        this.invoice = invoice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public introducao.poo.interfaces.model.model.heloo.entities.Invoice getInvoice() {
        return invoice;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setInvoice(introducao.poo.interfaces.model.model.heloo.entities.Invoice invoice) {
    }
}
