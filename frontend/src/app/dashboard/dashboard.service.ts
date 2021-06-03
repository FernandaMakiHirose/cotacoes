import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import Stock from '../shared/models/stock-model';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  readonly baseUrl = 'https://bootcamp-dio.herokuapp.com/bootcamp';

  /*criou a instância no construtor*/
  constructor(private http: HttpClient) { }

  /*método para buscar os stocks*/
  async getStocks(): Promise<Stock[]> {

    /*vai na url buscar um array de stock e vai retornar em promise*/
    return this.http.get<Stock[]>(`${this.baseUrl}/stock`).toPromise();
  }

}
