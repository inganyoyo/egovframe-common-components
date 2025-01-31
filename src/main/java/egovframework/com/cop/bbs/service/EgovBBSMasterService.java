package egovframework.com.cop.bbs.service;

import egovframework.com.cmm.LoginVO;
import java.util.List;
import java.util.Map;
import org.egovframe.rte.fdl.cmmn.exception.FdlException;

public interface EgovBBSMasterService {

  Map<String, Object> selectNotUsedBdMstrList(BoardMasterVO boardMasterVO);

  void deleteBBSMasterInf(BoardMaster boardMaster);

  void updateBBSMasterInf(BoardMaster boardMaster) throws Exception;

  BoardMasterVO selectBBSMasterInf(BoardMasterVO boardMasterVO) throws Exception;

  Map<String, Object> selectBBSMasterInfs(BoardMasterVO boardMasterVO);

  void insertBBSMasterInf(BoardMaster boardMaster) throws Exception;

  /*
   * 블로그 관련
   */
  Map<String, Object> selectBlogMasterInfs(BoardMasterVO boardMasterVO);

  String checkBlogUser(BlogVO blogVO);

  BlogVO checkBlogUser2(BlogVO blogVO);

  void insertBoardBlogUserRqst(BlogUser blogUser);

  void insertBlogMaster(Blog blog) throws FdlException;

  void insertBlogMasterAndBoardBlogUserRqst(Blog blog, LoginVO user) throws Exception;

  BlogVO selectBlogDetail(BlogVO blogVO) throws Exception;

  List<BlogVO> selectBlogListPortlet(BlogVO blogVO) throws Exception;

  List<BoardMasterVO> selectBBSListPortlet(BoardMasterVO boardMasterVO) throws Exception;

}
