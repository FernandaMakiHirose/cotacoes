import Stock from 'src/app/shared/models/stock-model';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-stock-card',
  templateUrl: './stock-card.component.html',
  styleUrls: ['./stock-card.component.css']
})
export class StockCardComponent implements OnInit {

  @Input()

  /*declarando uma propriedade*/
  stock = new Stock();

  constructor() { }

  ngOnInit(): void {
  }

  //Método de manipulação de string
  get variation(): string{

    /*transformando o número em string*/
    const localizedVariationString = this.stock.variation.toLocaleString();

    /*se for maior que 0 vai ser + senão vai ser -*/
    const prefix = this.stock.variation > 0 ? '+' : '-';

    /*vai retornar do - para sem nenhum sinal e adicionou o símbolo de porcentagem*/
    return `${prefix} ${localizedVariationString.replace('-', '')}%`;
  }

}
