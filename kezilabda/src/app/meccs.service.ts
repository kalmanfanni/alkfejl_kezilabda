import { Injectable } from '@angular/core';
import { Meccs } from 'src/app/domain/meccs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MeccsService {

  meccsek: Meccs[] = [ /*{"id": 3,
  "nev": "Csurgo Egyesulet",
  "palya_nev": "Csurgo csarnok",
  "cim": "Csurgo, Fo ut 30-31.",
  "ferohely": 500}as Csapat, {"id": 3,
  "nev": "Csurgo Egyesulet",
  "palya_nev": "Csurgo csarnok",
  "cim": "Csurgo, Fo ut 30-31.",
"ferohely": 500}as Csapat*/];
  
  filteredMeccsek: Meccs[] = this.meccsek;

  constructor(
    private http: HttpClient
  ) { }

  async getMeccsek() {
    const meccsek = await (this.http.get('meccs')
      .toPromise() as Promise<any[]>);
    this.filteredMeccsek = this.meccsek = meccsek.map(this.createMeccsModel);
  }

  /*async getIssue(issueId: number): Promise<Issue> {
    const issue = await (this.http.get(`issues/${issueId}`)
      .toPromise() as Promise<any>);
    return this.createIssueModel(issue);
  }

  async createIssue(issue: Issue): Promise<any> {
    await this.http.post('issues', issue).toPromise();
  }

  async modifyIssue(issue: Issue): Promise<any> {
    await this.http.patch(`issues/${issue.id}`, issue).toPromise();
  }

  filterChange(filterValue: string) {
    if (typeof filterValue === 'string') {
      if (filterValue === '') {
        this.filteredIssues = this.issues;
      } else {
        // Lehet ciklussal is :)
        this.filteredIssues = this.issues.filter(issue => {
          return issue.status === filterValue;
        });
      }
    }
  }
*/
  private createMeccsModel(meccs: any): Meccs {
    return {
      ...meccs
    } as Meccs;
  }
}
