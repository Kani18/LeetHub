class Solution {
    public int findCircleNum(int[][] isConnected) {
        int pc=0;
        boolean[] vis=new boolean[isConnected.length];
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==false){
                q.add(i);
                vis[i]=true;
                pc+=1;
            }
            while(!q.isEmpty()){
                Integer node=q.poll();
                //list la add
                for(int j=0;j<isConnected.length;j++){
                   // int neighbour=vis[node][j];
                    if(vis[j]==false && isConnected[node][j]==1){
                        q.add(j);
                        vis[j]=true;
                    }
                }
            }
        }
        return pc;
    }
}