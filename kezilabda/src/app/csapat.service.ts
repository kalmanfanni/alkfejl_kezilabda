import { Injectable } from '@angular/core';
import { Csapat } from 'src/app/domain/csapat';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CsapatService {

  csapatok: Csapat[] = [ /*{"id": 3,
  "nev": "Csurgo Egyesulet",
  "palya_nev": "Csurgo csarnok",
  "cim": "Csurgo, Fo ut 30-31.",
  "ferohely": 500}as Csapat, {"id": 3,
  "nev": "Csurgo Egyesulet",
  "palya_nev": "Csurgo csarnok",
  "cim": "Csurgo, Fo ut 30-31.",
"ferohely": 500}as Csapat*/];
  
  filteredCsapatok: Csapat[] = this.csapatok;

  constructor(
    private http: HttpClient
  ) { }

  async getCsapatok() {
    const csapatok = await (this.http.get('csapat')
      .toPromise() as Promise<any[]>);
    this.filteredCsapatok = this.csapatok = csapatok.map(this.createCsapatModel);
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
  private createCsapatModel(csapat: any): Csapat {
    return {
      ...csapat
    } as Csapat;
  }
}
