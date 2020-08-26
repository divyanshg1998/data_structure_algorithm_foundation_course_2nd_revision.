#include<bits/stdc++.h>
using namespace std;

void floodfill(vector<vector<int>>& v, int sr, int sc, string& psf)
{
// if we dont pass v and string with refrence then 
// at each level a new v ad string will be made 
// for sure

    if (sr == v.size()-1 && sc == v[0].size()-1)
    {
        cout << psf << endl;
        return;
    }
  

    v[sr][sc]=2;
    
    //0 for correct spot
    //1 for obstacle
    //2 for visited before itself


    if (sr - 1 >= 0 && v[sr - 1][sc] != 1 && v[sr-1][sc] != 2)
    {
        // cout<<"preD"<<endl;
        
        psf+='t';
        floodfill(v, sr - 1, sc, psf);
        psf.erase(psf.length()-1,1);
        
        // cout<<"postD"<<endl;
      
    } 
    if (sc - 1 >= 0 && v[sr][sc - 1] != 1 && v[sr][sc-1] != 2)
    {
        // cout<<"preD"<<endl;
        psf+='l';
        floodfill(v, sr, sc - 1, psf);
        psf.erase(psf.length()-1,1);
        // cout<<"postD"<<endl;
        
    } 

   if (sr + 1 < v.size() && v[sr + 1][sc] != 1 && v[sr+1][sc] != 2)   
       {
        // cout<<"preV"<<endl;
        psf+='d';
        floodfill(v, sr + 1, sc, psf );
        psf.erase(psf.length()-1,1);
        // cout<<"pokV"<<endl;
   
    }

    if (sc + 1 < v[0].size() && v[sr][sc + 1] != 1 && v[sr][sc+1] != 2)
    {
        // cout<<"preH"<<endl;
        psf+='r';
        floodfill(v, sr, sc + 1, psf );
        psf.erase(psf.length()-1,1);
        // cout<<"postH"<<endl;
        
    }

// v[sr][sc]=0;

// we dont unmark here
// soln:
// to find the problem we will have to debug

// we get only two paths here

}

int main(int argc, char** argv){

// no of ways by this matrix so that i could reach from 0,0 to the end
// 1 are obstacle
vector<vector<int>> v =
        {{0, 1, 0, 0, 0, 0, 0, 1},
         {0, 1, 0, 1, 1, 1, 0, 1},
         {0, 1, 0, 1, 0, 0, 0, 1},
         {0, 0, 0, 0, 0, 1, 1, 1},
         {0, 1, 0, 1, 0, 0, 0, 0},
         {0, 1, 0, 1, 1, 1, 1, 0}, 
         {0, 1, 0, 1, 1, 1, 1, 0},
         {0, 1, 0, 0, 0, 0, 0, 0}};
         
         string str="";

        floodfill(v, 0, 0, str);

    for(int i=0; i<v.size(); i++){
        for (int j=0; j< v[0].size(); j++){
            cout<<v[i][j]<<" ";
        }
        cout<<endl;
    }

        return 0;
}