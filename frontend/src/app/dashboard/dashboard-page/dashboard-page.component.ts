import { Component, OnInit } from '@angular/core';
import Stock from 'src/app/shared/models/stock-model';
import { DashboardService } from '../dashboard.service';

@Component({
  selector: 'app-dashboard-page',
  templateUrl: './dashboard-page.component.html',
  styleUrls: ['./dashboard-page.component.css']
})
export class DashboardPageComponent implements OnInit {

  /*atributo stocks que vai ser um array de stock e vai incializar essa propriedade com um array vazio*/
  stocks: Stock[] = [];

  /*injetando a instância*/
  constructor(private dashboardService: DashboardService) { }

  ngOnInit(): void {
    /*vai chamar o método*/
    this.fetchStocks();
  }

  /*é uma função assíncrona*/
  async fetchStocks(): Promise<void> {

    /*vai aguardar a resposta do servidor para atribuir o retorno no atributo*/
    this.stocks = await this.dashboardService.getStocks();
  }

}
